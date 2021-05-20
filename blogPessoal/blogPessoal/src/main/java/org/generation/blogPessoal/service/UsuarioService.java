package org.generation.blogPessoal.service;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.generation.blogPessoal.model.UserLogin;
import org.generation.blogPessoal.model.Usuario;
import org.generation.blogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository repository;
	
	public Usuario CadastrarUsuario(Usuario usuario) 
	{
		Optional<Usuario> usuarioExistente = repository.findByUsuario(usuario.getUsuario());
		if (usuarioExistente.isPresent()) {
			return null;
		} else {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			
			String senhaEncoder = encoder.encode(usuario.getSenha());
			usuario.setSenha(senhaEncoder);
			return repository.save(usuario);
		}
		
		
		}
	public Optional<UserLogin> logar(Optional<UserLogin> user)
	{
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuarioPresente = repository.findByUsuario(user.get().getUsuario());
		if(usuarioPresente.isPresent()) {
		
		if(encoder.matches(user.get().getSenha(), usuarioPresente.get().getSenha()))
		{
			String auth = user.get().getUsuario() + ":" + user.get().getSenha();
			byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
			String authHeader = "Basic " + new String(encodeAuth);
			
			user.get().setToken(authHeader);
			user.get().setNome(usuarioPresente.get().getNome());
			user.get().setSenha(usuarioPresente.get().getSenha());
			user.get().setFoto(usuarioPresente.get().getFoto());
			user.get().setTipo(usuarioPresente.get().getTipo());
			
			return user;
			}
		
		}
		return null;
	}
	
	public List<Usuario> getAll(){
		return repository.findAll();
	}
}
