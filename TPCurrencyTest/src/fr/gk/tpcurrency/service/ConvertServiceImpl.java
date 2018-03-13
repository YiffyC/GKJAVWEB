package fr.gk.tpcurrency.service;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Calendar;

import org.tempuri.ConverterSoap;
import org.tempuri.ConverterSoapProxy;

import fr.gk.tpcurrency.business.Devise;

public class ConvertServiceImpl implements ConvertService
{

	@Override
	public double convert(double montant, Devise fromDevise, Devise toDevise)
	{
		double res;
		BigDecimal m;
		ConverterSoap converter; 
		Calendar today;
		
		
		today = Calendar.getInstance();
		converter = new ConverterSoapProxy();
		m = BigDecimal.valueOf(montant);
		res = -1;
		
		
		try 
		{
			res = converter.getConversionAmount(fromDevise.getCode(), toDevise.getCode(), today, m).doubleValue();

		} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
		}
		return res;
		
		
		
	}

}
