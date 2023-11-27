package es.curso.java.hibernate.Ejercicios.Ejercicio1;

import java.util.List;


import es.curso.java.hibernate.Ejercicios.Ejercicio1.dao.UserDAO;
import es.curso.java.hibernate.Ejercicios.Ejercicio1.entity.UserEntity;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     UserDAO userDao= new UserDAO();
     List<UserEntity>usuarios=userDao.getUsersByName("NOMBRE");
    // logger.info("Empieza");
     for(UserEntity userEntity :usuarios) {
    	 System.out.println(userEntity);
     }
     System.out.println("Termina");
	}

}
