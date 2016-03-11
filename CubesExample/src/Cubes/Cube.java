package Cubes;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.*;

import static org.lwjgl.opengl.GL11.*;
 
public class Cube {

    public void start() {
    	float angle = 0;
        try {
        	Display.setDisplayMode(new DisplayMode(800,600));
        	Display.create();
        } catch (LWJGLException e) {
        	e.printStackTrace();
        	System.exit(0);
        }
 
	while (!Display.isCloseRequested()) {

	    GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
	    // Clear the screen and depth buffer
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, 800, 600, 0, 800, -600);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);

	    glShadeModel(GL_FLAT);
	    
	    GL11.glPushMatrix();
	    GL11.glLoadIdentity();
	    
 	    GL11.glTranslatef(400,300,0.0f);
	    GL11.glRotatef(angle, 0.0f, 0.5f, 0.0f);
	    GL11.glRotatef(50, 0.0f, 0.0f, 1.0f);
	    GL11.glScalef(100,100,100);
	    
	    GL11.glBegin(GL11.GL_QUAD_STRIP);
	     {
	    	//this Makes a box that has no top or bottom. 
	    	//Front - Orange
	    	//Right - White
	    	//Back - Blue
	    	//Left - Teal
		    
	    	glColor4f(1.0f,0.5f,0.0f,1.0f);	
	    	glVertex3f(0.0f,1.0f,0.0f);	//Front Bottom Left
	    	glVertex3f(0.0f,0.0f,0.0f);	//Front Top Left
	    	glVertex3f(1.0f,1.0f,0.0f);	//Front Bottom Right
	    	glVertex3f(1.0f,0.0f,0.0f);	//Front Top Right
	    	
	    	glColor4f(1.0f,1.0f,1.0f,1.0f);
	    	glVertex3f(1.0f,1.0f,1.0f);	//Right Bottom Back
	    	glVertex3f(1.0f,0.0f,1.0f);	//Right Top Back


	    	glColor4f(0.0f,0.0f,1.0f,1.0f);
	    	glVertex3f(0.0f,1.0f,1.0f);	//Back left Bottom
	    	glVertex3f(0.0f,0.0f,1.0f);	//Back Left Top
	    	

	    	glColor4f(0.0f,1.0f,1.0f,1.0f);
	    	glVertex3f(0.0f,1.0f,0.0f);	//Front Bottom Left
	    	glVertex3f(0.0f,0.0f,0.0f);	//Front Top Left
	    	
	     }
	    glEnd();	
	    GL11.glPopMatrix();
	    angle =120f;
	    //System.out.println(angle);

	    Display.update();
	    
	}
 
	Display.destroy();
    }
    
    
    
    
 
    public static void main(String[] argv) {
        Cube quadExample = new Cube();
        quadExample.start();
    }
}