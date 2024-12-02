/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artstreamfinal;

import static com.mycompany.artstreamfinal.Client.dashboardClient;
import static com.mycompany.artstreamfinal.Client.names;
import static com.mycompany.artstreamfinal.Client.noOfClient;
import static com.mycompany.artstreamfinal.Client.pass;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Artists extends Informations {
    
    public static ArrayList names = new ArrayList<>();
    public static ArrayList pass = new ArrayList<>();
    public static ArrayList<DashboardArtist> dashboardArtist = new ArrayList<>();
    public static int noOfClient = 0;
    public String typeOfArtist;
    
    public Artists(String username,String password)
    {
        super(username,password);
        this.typeOfArtist = typeOfArtist;
        
        try
        {           
            names.add(username);
            pass.add(password);
            
            DashboardArtist artist = new DashboardArtist(username);
            artist.setVisible(false);
            dashboardArtist.add(artist);
 
             System.out.println(names.get(noOfClient));
             System.out.println(pass.get(noOfClient));
             
            ++noOfClient;
            
        }catch(Exception e)
        {
            System.out.print("sdfdsf");
        }
        
    }
    
    
    
}
