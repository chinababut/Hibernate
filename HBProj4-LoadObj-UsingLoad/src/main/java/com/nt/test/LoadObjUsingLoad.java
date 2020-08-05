package com.nt.test;

import org.hibernate.Session;

import com.nt.entity.insurence.InsurencePolocy;
import com.nt.util.HibernateUtil;

public class LoadObjUsingLoad {

	
	public static void main(String[] args) {
		
		Session ses = null;
		InsurencePolocy polocy  = null;
		
		ses = HibernateUtil.getSession();
		System.out.println("Ses"+ses);
		//polocy = ses.load(InsurencePolocy.class, 1000L);

//		System.out.println("Policy:"+polocy.getClass());
//		System.out.println("id:"+polocy.getPolocyid());
		
		//System.out.println("Insurencepolocy:"+polocy);
		
		


	}

}
