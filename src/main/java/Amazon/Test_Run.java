package Amazon;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Run extends Snuza2
{
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		String	url0="https://www.amazon.com/dp/B07P98D67X";
		
		String	url1="https://www.amazon.com/Snuza-Portable-Baby-Movement-Monitor/dp/B002WLGV08";
		
		String	url2="https://www.amazon.com/Cocoon-Cam-Plus-Breathing-Monitoring/dp/B07BRKFS24";
		
		String	url3="https://www.amazon.com/Owlet-Baby-Monitor-Infants-Ultimate/dp/B06ZZXYD6S";
		
		String	url4="https://www.amazon.com/Lollipop-driveretection-Turquoise-monitor-Infrared/dp/B07RM8MKZ7";
		
		String	url5="https://www.amazon.com/Owlet-Cam-Baby-Video-Monitor/dp/B07MFR6NZG";
		
		String	url6="https://www.amazon.com/Arlo-Monitor-Sensors-Lullaby-HomeKit/dp/B0756MFCKK";
		
		String	url7="https://www.amazon.com/Cocoon-Cam-Plus-Breathing-Monitoring/dp/B07BRKFS24";
		
		String	url8="https://www.amazon.com/Snuza-Monitor-Movement-Tracking-Temperature/dp/B00IISBHXU";
		
		String	url9="https://www.amazon.com/Miku-Smart-Baby-Monitor-Contact-Free/dp/B07N6NBRGD";
		
		String [] url= {url0,url1,url2,url3,url4,url5,url6,url7,url8,url9};
		String [] urls= {url0,url1};
		
		Snuza2 sz=new Snuza2();	
		sz.Nanit_Monitor(url0);		  
		sz.Snuza_Monitor(url1);	  
		sz.Cocoon1_monitor(url2);
		sz.Owlet_monitor(url3);
		sz.Lollipop_Smart(url4);
		sz.Owlet2_Smart(url5);
		sz.Arlo_Smart(url6); 
		sz.Cocoon2_Smart(url7);
		sz.Snuza2_Smart(url8); 
		sz.Miku_Smart(url9);

	}
}
