import graphADT.GraphAdjLists;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class list2reverse {

	public static void main(String[] args) {
		BufferedReader breader=null;
		BufferedReader breader2=null;
		try{
		breader=new BufferedReader(new FileReader("list.txt"));	
		int lines = 0;
		while (breader.readLine() != null) lines++;
		breader.close();
		breader2=new BufferedReader(new FileReader("list.txt"));	
		
		GraphAdjLists adjlist=new GraphAdjLists(breader2, lines);
		adjlist.reverseList(lines);
		File rlist= new File("reverselist.txt");
		
		if(!rlist.exists()){
			rlist.createNewFile();			
		}
		FileWriter fw=new FileWriter(rlist.getAbsoluteFile());
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(adjlist.toString());
		bw.close();
		
		
		}catch(IOException e){
			System.out.println(e);
		}

	}

}
