/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author N C S
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField Y1;
    @FXML
    private TextField Y2;
    @FXML
    private TextField M1;
    @FXML
    private TextField M2;
    @FXML
    private TextField D1;
    @FXML
    private TextField D2;
    @FXML
    private Label answer;
    
    public void compute(ActionEvent e){
    
        short yearOfExpiretion = Short.valueOf(Y1.getText());
        byte monthOfExpiretion = Byte.valueOf(M1.getText());
        byte dayOfExpiretion = Byte.valueOf(D1.getText());
        short yearOfENow = Short.valueOf(Y2.getText());
        byte monthOfNow = Byte.valueOf(M2.getText());
        byte dayOfNow = Byte.valueOf(D2.getText());
        
        int dayExp=0,dayNow=0,remainDay;
        
        dayExp = yearOfExpiretion*365;
        for(int s=1; s<=yearOfExpiretion;s++){
            //count leap year(sale kabise) one more days if assume every 4 years have it
            if(s%4==0){
            dayExp++;
        }
        }
        //count 31 six month first, 30 five month second and 29 last month
        switch(monthOfExpiretion){
            case 1: 
                int i = 2;
                while(i<=monthOfExpiretion){
                dayExp += 31;
                i++;
                }
                break;
                case 2: 
                int v = 2;
                while(v<=monthOfExpiretion){
                dayExp += 31;
                v++;
                }
                break;
                case 3: 
                int q = 2;
                while(q<=monthOfExpiretion){
                dayExp += 31;
                q++;
                }
                break;
                case 4: 
                int m = 2;
                while(m<=monthOfExpiretion){
                dayExp += 31;
                m++;
                }
                break;
                case 5: 
                int y = 2;
                while(y<=monthOfExpiretion){
                dayExp += 31;
                y++;
                }
                break;
                case 6: 
                int r = 2;
                while(r<=monthOfExpiretion){
                dayExp += 31;
                r++;
                }
                break;
            case 7:
                dayExp += 186;
                int j=8;
                while(j<=monthOfExpiretion){
                dayExp +=30;
                j++;
                }
                break;
                case 8:
                dayExp += 186;
                int b=8;
                while(b<=monthOfExpiretion){
                dayExp +=30;
                b++;
                }
                break;
                case 9:
                dayExp += 186;
                int a=8;
                while(a<=monthOfExpiretion){
                dayExp +=30;
                a++;
                }
                break;
                case 10:
                dayExp += 186;
                int g=8;
                while(g<=monthOfExpiretion){
                dayExp +=30;
                g++;
                }
                break;
                case 11:
                dayExp += 186;
                int l=8;
                while(l<=monthOfExpiretion){
                dayExp +=30;
                l++;
                }
                break;
            case 12:
                dayExp += 336;               
        }
        dayExp += dayOfExpiretion; 
        
        dayNow = yearOfENow*365;
        for(int p=1; p<=yearOfENow;p++){
        if(p%4==0){
            //count leap year(sale kabise) one more days if assume every 4 years have it
        dayNow++;
        }
        }
        //count 31 six month first, 30 five month second and 29 last month
        switch(monthOfNow){
            case 1: 
                int w = 2;
                while(w<=monthOfNow){
                dayNow += 31;
                w++;
                }
                break;
                case 2: 
                int v = 2;
                while(v<=monthOfNow){
                dayNow += 31;
                v++;
                }
                break;
                case 3: 
                int n = 2;
                while(n<=monthOfNow){
                dayNow += 31;
                n++;
                }
                break;
                case 4: 
                int s = 2;
                while(s<=monthOfNow){
                dayNow += 31;
                s++;
                }
                break;
                case 5: 
                int l = 2;
                while(l<=monthOfNow){
                dayNow += 31;
                l++;
                }
                break;
                case 6: 
                int q = 2;
                while(q<=monthOfNow){
                dayNow += 31;
                q++;
                }
                break;
            case 7:
                dayNow += 186;
                int a=8;
                while(a<=monthOfNow){
                dayNow += 30;
                a++;
                }
                break;
                case 8:
                dayNow += 186;
                int c=8;
                while(c<=monthOfNow){
                dayNow += 30;
                c++;
                }
                break;
                case 9:
                dayNow += 186;
                int x=8;
                while(x<=monthOfNow){
                dayNow += 30;
                x++;
                }
                break;
                case 10:
                dayNow += 186;
                int y=8;
                while(y<=monthOfNow){
                dayNow += 30;
                y++;
                }
                break;
                case 11:
                dayNow += 186;
                int d=8;
                while(d<=monthOfNow){
                dayNow += 30;
                d++;
                }
                break;
            case 12:
                dayNow += 336;               
        }
        dayNow += dayOfNow;
               
        remainDay = dayNow-dayExp;
            
        int remainYear = remainDay/365;
        remainDay = remainDay%365;
        int remainMonth = remainDay/30;
        remainDay = remainDay%30;
        answer.setText("REMAIN => Year: " + remainYear + " Month: " + remainMonth + " Day: " + remainDay);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
