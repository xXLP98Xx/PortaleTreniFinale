package com.corso.treno.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Transactional;

import com.corso.treno.filter.TrenoFilter;
import com.corso.treno.model.Treno;

public class TrenoDAOImpl extends BaseDAO implements TrenoDAO{
	@PersistenceContext
	EntityManager manager;

	@Override
	public Treno find(int id) {
		Treno t = manager.find(Treno.class, id);	 // in hibernate  get / load 
		return t;
	}

	@Override
	@Transactional
	public void add(Treno t) {
		//t.setUtenteId(idUtente);
		manager.persist(t);
	}

	@Override
	@Transactional
	public void remove(int idTreno) {
		Treno t=this.find(idTreno);
		if(t!=null) {
			System.out.println("Treno rimosso: " + t);
			manager.remove(t);
		}
	}

	@Override
	@Transactional
	public void update(int idTrenoOld, Treno trenoNew) {
		Treno tOld = this.find(idTrenoOld);
		if(tOld!=null) {
			tOld.setUtenteId(trenoNew.getUtenteId());
			tOld.setCompagnia(trenoNew.getCompagnia());
			System.out.println("Treno aggiunto: " + tOld);
			manager.merge(tOld);
		}
	}

	@Override
	public void inversion(Treno t) {
		/*1 - Query con idTreno nella tabella vagone -> ritorna una lista di vagoni
		  2 - Verificata locomotiva in coda
		  3 - Se c'è find di treno e set motrice con id locomotiva in coda
		  4 - Aggiornare le posizioni di tutti i vagoni (inversione)
		*/
	}

	@Override
	public void duplicate(int idTreno) {
		Treno t = this.find(idTreno);
		if(t!=null) {
			Treno tClone = new Treno(t.getUtenteId(),t.getCompagnia());
			this.add(tClone);
			System.out.println("Treno aggiunto: " + tClone);
		}
		
		/*1 - Query con idTreno nella tabella vagone -> ritorna una lista di vagoni
		 *2 - Creare un treno nuovo nella tabella treni dopo aver cercato il vecchio (set motrice = -1 all'inizio
		 *perchè non è ancora stata creata, dopo la creazione si fa il set giusto) -> se si toglie motrice da treno
		 *la roba fra parentesi non si fa
		 *3 - Ciclo for sulla lista vagoni: 
		 *4 - Verificare il tipo di vagone e crealo nuovo con idTreno = new IdTreno e inserlo nella tabella
		*/
	}
	
	@Override
	public List<Treno> findByFilter(TrenoFilter filter) {
		
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		
		CriteriaQuery<Treno> criteriaQuery = criteriaBuilder.createQuery(Treno.class); 
		
		Root<Treno> criteriaRoot = criteriaQuery.from(Treno.class);
		
		Predicate p1 = null, p2=null;
	
		if (filter.getPrezzoMin()!=null) {
			p1  = criteriaBuilder.greaterThanOrEqualTo(criteriaRoot.get("prezzo"), filter.getPrezzoMin());                     
		}
		
		if (filter.getPrezzoMax()!=null) {
			p2  = criteriaBuilder.lessThanOrEqualTo(criteriaRoot.get("prezzo"), filter.getPrezzoMax());
		}
		
		// attenzione la baco nel cao uno dei due sia null
		Predicate beetwenPrezzo = criteriaBuilder.and(p1,p2);
		
		//Predicate finale = criteriaBuilder.and(name, beetwenPrezzo);
		
		criteriaQuery.where(beetwenPrezzo);
		
		Query query = manager.createQuery(criteriaQuery);
		
		List<Treno> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<Treno> all() {
		Query q = manager.createQuery("from treno", Treno.class);
		@SuppressWarnings("unchecked")
		List<Treno> l = q.getResultList();
		return l;
	}

	@Override
	public List<Treno> findByNameCompagnia(String name) {
		Query q = manager.createQuery("from treno where compagnia like :name", Treno.class);
		q.setParameter("name", name + "%");
		@SuppressWarnings("unchecked")
		List<Treno> l = q.getResultList();
		return l;
	}
	
	@Override
	public List<Treno> findByUtente(int idUtente) {
		Query q = manager.createQuery("from treno where utente_id like :idUtente", Treno.class);
		q.setParameter("idUtente", idUtente);
		@SuppressWarnings("unchecked")
		List<Treno> l = q.getResultList();
		return l;
	}

}
