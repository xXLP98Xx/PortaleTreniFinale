package com.corso.builder;

import java.util.ArrayList;


import com.corso.exception.LocomotivaNonInTestaException;
import com.corso.exception.PasseggeriCargoException;
import com.corso.exception.PesoEccessivoException;
import com.corso.exception.RistoranteCargoException;
import com.corso.exception.RistoranteException;
import com.corso.exception.StringException;
import com.corso.treno.model.Motrice;
import com.corso.treno.model.Treno;
import com.corso.treno.model.Vagone;


public abstract class TrenoBuilder {
	public Treno costruisciTreno(int idUtente, String sigla) throws PesoEccessivoException, StringException 
	{
		ArrayList<Vagone> listaVagoni = new ArrayList<Vagone>();
		
		controlString(sigla);
		for (int i = 0; i < sigla.length(); i++) {
            char c = sigla.charAt(i);
            Vagone v = null;
            
            switch(c) {
    		case 'H':
    			v = getMotrice();
    			listaVagoni.add(v);
    		case 'P':
    			v = getPasseggeri();
    			listaVagoni.add(v);
    			break;
    		case 'R':
    			v = getRistorante();
    			listaVagoni.add(v);
    			break;
    		case 'C':
    			v = getCargo();
    			listaVagoni.add(v);
    			break;
			default:
				//throw new CarattereIllegaleException("Carattere non consentito", c);
    		}
            
        }
		checkPeso(listaVagoni);
		//checkLunghezza();
		return new Treno(idUtente, listaVagoni);
	}
	
	

	private void checkPeso(ArrayList<Vagone> l) throws PesoEccessivoException {
		Motrice m = (Motrice) l.get(0);
		double pesoTrainabile = m.getPesoTrainabile();
		int pesoTot=0;
		for(Vagone c : l) {
			pesoTot = pesoTot + c.getPeso();
		}
		
		if(pesoTot>m.getPesoTrainabile())
			throw new PesoEccessivoException("Peso eccessivo per questa motrice");
	}



	protected abstract Vagone getMotrice();
	protected abstract Vagone  getPasseggeri();
	protected abstract Vagone getRistorante();
	protected abstract Vagone getCargo();
		
	
	
	//permette locomotiva in testa e in coda
	private void controlString(String s) throws StringException {
		if(s.length()<3)
			throw new StringException("Errore nella lunghezza della stringa");
		locomotivaInTestaOCoda(s);
		locomotivaNonInMezzo(s);
		ristoranteInMezzo(s);
		cargoEPasseggeri(s);
		cargoERistorante(s);
	}

	private void cargoERistorante(String s) throws PasseggeriCargoException {
		if(s.contains("C") && s.contains("R"))
			throw new PasseggeriCargoException("Un treno non può contenere Cargo e Passeggeri");		
	}



	private void cargoEPasseggeri(String s) throws RistoranteCargoException {
		if(s.contains("C") && s.contains("P")){
			throw new RistoranteCargoException("Passeggeri e Cargo nella stessa sigla!");
		}
	}



	private void ristoranteInMezzo(String s) throws RistoranteException {
		 if (!s.contains("R")) {
	            return;
	        }
	        
	        int length = s.length();
	        int rCount = 0;

	        for (int i = 0; i < length; i++) {
	            if (s.charAt(i) == 'R') {
	                rCount++;
	            }
	        }

	        if (rCount > 1) {
	            throw new RistoranteException("Ristorante non in mezzo al treno!");
	        }

	        int centerIndex = length / 2;
	        if (length % 2 == 0) {
	            if (s.charAt(centerIndex - 1) != 'R' && s.charAt(centerIndex) != 'R') {
	                throw new RistoranteException("R posizionata male nel treno");
	            }
	        } else {
	            if (s.charAt(centerIndex) != 'R') {
	                throw new RistoranteException("R posizionata male nel treno");
	            }
	        }
	}

	private void locomotivaNonInMezzo(String s) throws LocomotivaNonInTestaException {
		String trenoSenzaLoc = s.substring(1, s.length()-1);
		if(trenoSenzaLoc.contains("H"))
			throw new LocomotivaNonInTestaException("Locomotiva nel corpo del treno!", s);			
	}

	private void locomotivaInTestaOCoda(String s) throws LocomotivaNonInTestaException {
		if(s.charAt(0)!='H' && s.charAt(s.length()-1)!='H')
			throw new LocomotivaNonInTestaException("Locomotiva non in testa!", s);
	}
}
