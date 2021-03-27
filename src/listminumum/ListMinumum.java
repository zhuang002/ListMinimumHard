/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listminumum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 *
 * @author zhuan
 */
public class ListMinumum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(reader.readLine());
            PriorityQueue<Integer> queue=new PriorityQueue();
            
            for (int i=0;i<n;i++) {
                queue.add(Integer.parseInt(reader.readLine()));
            }

            while (!queue.isEmpty()){
                System.out.println(queue.poll());
            }

        } catch (Exception e) {
        }
        
                
    }
    
}

