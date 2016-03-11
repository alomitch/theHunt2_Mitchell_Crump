/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byu.cit260.theHunt2.model;
import java.awt.Point;
import java.io.Serializable;
/**
*
* @author mikec_000
*/
public enum Actor implements Serializable {

Monkey("He is a goofy animal on the island."),
Dog("4 legged animal");

private final String description;
private final Point coordinates;
private String name;

Actor (String description){
this.description = description;
coordinates = new Point(1,1);
}
public String getDescription() {
return description;
}
public Point getCoordinates() {
return coordinates;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
@Override
public String toString() {
return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
}



}
