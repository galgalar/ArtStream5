/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.artstreamfinal;

/**
 *
 * @author Owner
 */

import java.util.*;
public abstract class Informations {
    
    private String username, password;
  
    
    public Informations( String username,String password)
    {
        this.username = username;
        this.password = password;  
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getUsername()
    {
        return username;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return password;
    }
    
    
    
}
