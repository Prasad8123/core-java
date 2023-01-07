package com.xworkz.collection.streamimpl.dtoimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.collection.streamimpl.dto.DatabaseVendorDto;
import com.xworkz.collection.streamimpl.dto.Type;

public class DatabaseVendorsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
                DatabaseVendorDto database1=new DatabaseVendorDto("Amezon web services","Amezon",Type.Relatinal,100.0);
                DatabaseVendorDto database2=new DatabaseVendorDto("Microsoft Azurs","Microsoft",Type.RNH,150.0);
                DatabaseVendorDto database3=new DatabaseVendorDto("G-could","Google",Type.Relatinal,170.0);
                DatabaseVendorDto database4=new DatabaseVendorDto("Adabas","Software-ag",Type.Relatinal,100.0);
               DatabaseVendorDto database5=new DatabaseVendorDto("Orcale servers","Orecal",Type.Relatinal,200.0);
 
 
               Collection<DatabaseVendorDto> data=new ArrayList<DatabaseVendorDto>();
                  data.add(database1);
                  data.add(database2);
                  data.add(database3);
                  data.add(database4);
                  data.add(database5);
                  
                  
                  data.stream().map(e->e.getDevelopedBy().toUpperCase()).collect(Collectors.toList()).forEach(e->System.out.println(e));
                  System.out.println(System.lineSeparator());
                  data.stream().filter(e->e.getLicenseCost()<200 &&  e.getType().equals(Type.Relatinal)).collect(Collectors.toList()).forEach(e->System.out.println(e));
                  
                  System.out.println(System.lineSeparator());
                  data.stream().map(e->e.getType()).collect(Collectors.toList()).forEach(e->System.out.println(e));
 
 

	}

}
