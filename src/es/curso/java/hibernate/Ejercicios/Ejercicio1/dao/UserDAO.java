package es.curso.java.hibernate.Ejercicios.Ejercicio1.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.curso.java.hibernate.Ejercicios.Ejercicio1.entity.UserEntity;
import es.curso.java.hibernate.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class UserDAO {
	private static final Logger logger=LogManager.getLogger(UserDAO.class);
    private  EntityManager em;
    
    
	public EntityManager getEm() {
		this.em = JpaUtil.getEntityManager();

		return em;
	}

	public void setEm(EntityManager em) {
		this.em = JpaUtil.getEntityManager();
	}

	public UserDAO(EntityManager em) {
		super();
		this.em = JpaUtil.getEntityManager();
	}
    
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}

	public List<UserEntity> getUsers(){
		List<UserEntity> usuarios= new ArrayList<UserEntity>();
		usuarios= em.createQuery("from UserEntity", UserEntity.class).getResultList();
		
		return usuarios;}
	
	public List<UserEntity> getUsersByName(String name){
		List<UserEntity> usuarios;
		Query query= em.createQuery("from UserEntity ue where ue.nombre=?1", UserEntity.class);
		query.setParameter(1, name);
		usuarios= query.getResultList();
		//Se pone ?1 pero tenemos que ir indicando la posicion que ocupa esa parametro
		return usuarios;}
	
	public List<UserEntity> getUsersByDate(Date fechaConsulta){
		List<UserEntity> usuarios;
		Query query =em.createQuery("from UserEntity ue where ue.fechaAlta>=?1", UserEntity.class);
		query.setParameter(1, fechaConsulta);
		usuarios=query.getResultList();
		
		return usuarios;}
	
	public void insertarUsuario (UserEntity user, EntityManager em) {
		 
		em.getTransaction().begin();
		 try {
			 em.persist(user);
			 
			 em.getTransaction().commit();
		 }catch(Exception e) {
			 em.getTransaction().rollback();
		 }
	     
	}
	public void crearArchivo(String nombre, UserEntity user) {
		File archivo = new File(nombre);
		try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {

			buffer.append(user.getId()+";")
				.append(user.getNombre()+";")
				.append(user.getApellidos()+";")
			    .append(user.getFechaAlta()+";");

			// buffer.close();
			System.out.println("El archivo se ha creado con éxito!");
		} catch (IOException e) {
			e.printStackTrace();
		}



}}
