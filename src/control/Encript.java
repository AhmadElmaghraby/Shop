/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;

public class Encript {
   public Encript(String x) throws Exception{
   
      //Creating a Signature object
      Signature sign = Signature.getInstance("SHA256withRSA");
      
      //Creating KeyPair generator object
      KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
      
      //Initializing the key pair generator
      keyPairGen.initialize(2048);
      
      //Generating the pair of keys
      KeyPair pair = keyPairGen.generateKeyPair();      
	
      //Creating a Cipher object
      Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        
      //Initializing a Cipher object
      cipher.init(Cipher.ENCRYPT_MODE, pair.getPublic());
	  
      //Adding data to the cipher
      byte[] input = x.getBytes();	  
      cipher.update(input);
	  
      //encrypting the data
      byte[] cipherText = cipher.doFinal();	 
      System.out.println(new String(cipherText, "UTF8"));
   }
}