/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Mansilla
 */
public class Node {
    private Object data;
    private Node next;
    private Node previous;
    
    public Node(Object data){
        this.data = data;
    }
    
    public Node(Bolsa d,Node n,Node p){
        data = d;
        next = n;
        previous = p;
    }

    Node() {
        
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
    
    
}
