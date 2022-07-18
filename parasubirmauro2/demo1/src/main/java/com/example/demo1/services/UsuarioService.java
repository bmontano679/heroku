package com.example.demo1.services;
import java.util.ArrayList;
import com.example.demo1.models.UsuarioModel;
import com.example.demo1.repositories.UsuarioRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    //findAll metodo de CrudRepository
   }
    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);  //save metodo de CrudRepository
    }//**************** 2da etapa
    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }
    public ArrayList<UsuarioModel>  obtenerPorConsulta(String consulta) {
        return usuarioRepository.findByConsulta(consulta);
    }
    public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
}
