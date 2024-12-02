/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artstreamfinal;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Client extends Informations{
    
    public static ArrayList names = new ArrayList<>();
    public static ArrayList pass = new ArrayList<>();
    public static ArrayList<DashboardClient> dashboardClient = new ArrayList<>();
    public static int noOfClient = 0;
    public Client(String username,String password)
    {
        super(username,password);
 
        try
        {           
            names.add(username);
            pass.add(password);
            
            DashboardClient client = new DashboardClient(username);
            client.setVisible(false);
            dashboardClient.add(client);
 
             System.out.println(names.get(noOfClient));
             System.out.println(pass.get(noOfClient));
             
            ++noOfClient;
            
        }catch(Exception e)
        {
            System.out.print("sdfdsf");
        }
       
        
    }
    
    
    
}
