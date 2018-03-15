package fr.gkj.tp1.service.impl;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;

import org.tempuri.ConverterSoap;
import org.tempuri.ConverterSoapProxy;

import fr.gkj.tp1.business.Devise;
import fr.gkj.tp1.service.ConversionService;

public class ConversionServiceAxisImpl implements ConversionService{
	private ConverterSoap converter = new ConverterSoapProxy();

	@Override
	public double convert(double montant, Devise deviseIN, Devise deviseOUT) {
		
		try{
		BigDecimal montantIN = new BigDecimal(montant);
		Calendar today = Calendar.getInstance();
		
		BigDecimal Resultat = converter.getConversionAmount(deviseIN.getCode(), deviseOUT.getCode(), 
				today, montantIN);
		
		return Resultat.doubleValue();
		}
		catch(RemoteException rme){
			throw new RuntimeException(rme);
		}
	}

}
