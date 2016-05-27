/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity2.trees;

/**
 *
 * @author AULA1
 */
public class Node {
    protected int data;
    protected Node left;
    protected Node right;
    
    public Node(int d) {
        data = d;
        left = right = null;
    }
    
}
