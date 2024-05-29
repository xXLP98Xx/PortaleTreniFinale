package com.corso.treno.dao;

import java.time.LocalDate;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.corso.treno.model.Passeggeri;
import com.corso.treno.model.Ristorante;
import com.corso.treno.model.Cargo;
import com.corso.treno.model.Motrice;
import com.corso.treno.model.Utente;
import com.corso.treno.service.TrenoService;
import com.corso.treno.service.TrenoServiceImpl;
import com.corso.treno.service.UtenteService;
import com.corso.treno.service.UtenteServiceImpl;


@Configuration   /*qui ci cono le istanze da creare e gestire con il container di Spring DI-IoC*/
//@ComponentScan(basePackages="com.corso.treno")

@EnableTransactionManagement /* Abilita la gestione delle transazioni */


public class Beans {
/*	
	@Bean(name = "vagone")
    @Lazy
    @Scope("singleton")
    public Cargo getCargoVagone() {
        return new Cargo(0, 0, 0, 0, null, 0, 0, 0);
    }
	
	@Bean(name = "vagone")
    @Lazy
    @Scope("singleton")
    public Passeggeri getPasseggeriVagone() {
        return new Passeggeri();
    }
	
	@Bean(name = "vagone")
    @Lazy
    @Scope("singleton")
    public Ristorante getRistoranteVagone() {
        return new Ristorante(1, 0, 0, 0, null, 0, 0, 10);
    }
	
	@Bean(name = "vagone")
    @Lazy
    @Scope("singleton")
    public Motrice getMotriceVagone() {
        return new Motrice(0, 0, 0, 0, null, 0, 0);
    }
*/
//    @Bean(name = "cargo")
//    @Lazy
//    @Scope("singleton")
//    public Cargo getCargo() {
//        return new Cargo(1, 2000, 0, 0, null, 0, 0, 0);
//    }
//	
//    @Bean(name = "passeggeri")
//    @Lazy
//    @Scope("singleton")
//    public Passeggeri getPasseggeri() {
//        return new Passeggeri(0, 0, 0, 0, null, 0, 0, 0, null);
//    }
//    
//    @Bean(name = "ristorante")
//    @Lazy
//    @Scope("singleton")
//    public Ristorante getRistorante() {
//        return new Ristorante(0, 0, 0, 0, null, 0, 0, 10);
//    }
//    
//    @Bean(name = "ristorante")
//    @Lazy
//    @Scope("singleton")
//    public Motrice getMotrice() {
//        return new Motrice(0, 0, 0, 0, null, 0, 0);
//    }

	@Bean(name="passeggeriDAO")
	public PasseggeriDAO getPasseggeriDAO() {
		PasseggeriDAO dao = new PasseggeriDAOImpl();
		return dao; 
	}

    
	@Bean(name="cargoDAO")
	public CargoDAO getCargoDAO() {
		CargoDAO dao = new CargoDAOImpl();
		return dao; 
	}
	
	@Bean(name="ristoranteDAO")
	public RistoranteDAO getRistoranteDAO() {
	
		RistoranteDAO dao = new RistoranteDAOImpl();
		return dao; 
	}
	
	@Bean(name="motriceDAO")
	public MotriceDAO getMotriceDAO() {
		MotriceDAO dao = new MotriceDAOImpl();
		return dao; 
	}
	
	@SuppressWarnings("deprecation")
	@Bean(name="utente")
	@Lazy
	@Scope("singleton")
	public Utente getUtente() {
		return new Utente("Pippo", "Pluto", "aaa", "bbb", LocalDate.of(1990, 10, 10));
	}
	
	//DAO
	
	@Bean(name="utenteDAO") 
	public UtenteDAO getUtenteDao (){
		UtenteDAO dao = new UtenteDAOImpl();
		return dao; 
	}

	@Bean(name="trenoDAO")
	public TrenoDAO getTrenoDao() {
		TrenoDAO dao=new TrenoDAOImpl();
		return dao;
	}	
	
	//service
	
	@Bean(name="utenteService") 
	public UtenteService getUtenteService (){
		UtenteService service = new UtenteServiceImpl();
		//service.setUtenteService(getUtenteDao());
		return service; 
	}	
	
	@Bean(name="trenoService") 
	public TrenoService getTrenoService (){
		TrenoService service = new TrenoServiceImpl();
		/*togliere set*/
		service.setTrenoService(getTrenoDao());
		return service; 
	}	
	
	
	@Bean(name="dataSource")
	public DataSource getDataSource () {
		
		DriverManagerDataSource ds = new DriverManagerDataSource(); 
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");

		ds.setPassword("Modric98ita");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/corso_treno1");
		return ds; 
	} 
	
	@Bean
    public LocalContainerEntityManagerFactoryBean  getEntityManager(){
    	 
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
    	 
    	 // factory.setValidationMode(ValidationMode.AUTO);
		
    	 // JDBC
    	 factory.setDataSource(getDataSource());  
    	 
    	 // imposta il dialogo tra JPA e hibernate
    	 factory.setJpaVendorAdapter(getJpaVendorAdapter()); // imposta il dialogo tra JPA e hibernate
    	 
    	 // impostare il luogo dove si trovano le entity con il mapping
    	 factory.setPackagesToScan("com.corso.treno"); // "com.corso.spring"
    	 // oppure "com.corso.spring...." al posto di this.getClass().getPackage().getName()
    	 return factory; 
    }
	
	private HibernateJpaVendorAdapter getJpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.MYSQL);   // obbligatorio: serve per tradurre le query nel particolare Dialetto
		
		adapter.setGenerateDdl(true);          //facoltativo, attiva il DDL cio� hibernate creer� le strutture nel DB se non sono gi� essitenti
		adapter.setShowSql(true);              // mostra l'SQL, comodo per i corsi e per il debug ma in produzione solitamente � a false
		return adapter;
	}
	
	@Bean
	public PlatformTransactionManager getTransactionManager(){
	      JpaTransactionManager transactionManager = new JpaTransactionManager();
	 //     transactionManager.setEntityManagerFactory(getEntityManager().getObject());
	      //transactionManager.setNestedTransactionAllowed(false);
	      return transactionManager;
	}
}