package helicopter;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.glu.GLU;

public class BasicRenderer {

	private float rtri; // Angle For The Triangle ( NEW )
	private float pindah;
	private float arah = 2.0000002f;
	private boolean cek = true;
	private DisplayMode displayMode;

	public void Start() {
		try {
			CreateWindow();
			InitGL();
			
			Run();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	private void CreateWindow() throws Exception {
		Display.setFullscreen(false);
		DisplayMode d[] = Display.getAvailableDisplayModes();
		for (int i = 0; i < d.length; i++) {
			if (d[i].getWidth() == 640 && d[i].getHeight() == 480 && d[i].getBitsPerPixel() == 32) {
				displayMode = d[i];
				break;
			}
		}
		Display.setDisplayMode(displayMode);
		//Display.setFullscreen(true);
		Display.setTitle("LWJGL Voxel engine");
		Display.create();
	}

	private void InitGL() {
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
		GL11.glClearDepth(1.0);
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		GL11.glDepthFunc(GL11.GL_LEQUAL);
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GLU.gluPerspective(45.0f, (float) displayMode.getWidth() / (float) displayMode.getHeight(), 0.1f, 100.0f);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glHint(GL11.GL_PERSPECTIVE_CORRECTION_HINT, GL11.GL_NICEST);
		
	}

	private void Run() {
		while (!Display.isCloseRequested()) {
			try {
				Render();
				Display.update();
				Display.sync(60);
			} catch (Exception e) {

			}
		}
		Display.destroy();

	}

	private void Render() {
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glLoadIdentity();
		GL11.glTranslatef(pindah, 1.0f, -6.0f);

		GL11.glRotatef(rtri, 0.0f, 1.0f, 0.0f);

		GL11.glBegin(GL11.GL_TRIANGLES);
		GL11.glColor3f(1.0f, 0.0f, 0.0f);
		GL11.glVertex3f(0.0f, 1.0f, 0.0f);
		GL11.glColor3f(0.0f, 1.0f, 0.0f);
		GL11.glVertex3f(-1.0f, -1.0f, 1.0f);
		GL11.glColor3f(0.0f, 0.0f, 1.0f);
		GL11.glVertex3f(1.0f, -1.0f, 1.0f);
		GL11.glColor3f(1.0f, 0.0f, 0.0f);
		GL11.glVertex3f(0.0f, 1.0f, 0.0f);
		GL11.glColor3f(0.0f, 0.0f, 1.0f);
		GL11.glVertex3f(1.0f, -1.0f, 1.0f);
		GL11.glColor3f(0.0f, 1.0f, 0.0f);
		GL11.glVertex3f(1.0f, -1.0f, -1.0f);
		GL11.glColor3f(1.0f, 0.0f, 0.0f);
		GL11.glVertex3f(0.0f, 1.0f, 0.0f);
		GL11.glColor3f(0.0f, 1.0f, 0.0f);
		GL11.glVertex3f(1.0f, -1.0f, -1.0f);
		GL11.glColor3f(0.0f, 0.0f, 1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, -1.0f);
		GL11.glColor3f(1.0f, 0.0f, 0.0f);
		GL11.glVertex3f(0.0f, 1.0f, 0.0f);
		GL11.glColor3f(0.0f, 0.0f, 1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, -1.0f);
		GL11.glColor3f(0.0f, 1.0f, 0.0f);
		GL11.glVertex3f(-1.0f, -1.0f, 1.0f);
		GL11.glEnd();
		rtri += 15;
		if (cek && (pindah <= arah)) {
			pindah += 0.1f;
			//System.out.println(pindah);
			if (pindah == 2.0000002f) {
				cek = false;
			}
		}
		if (!cek && (pindah >= -arah)) {
			pindah -= 0.1f;
			//System.out.println(pindah);
			if (pindah == -2.0000002f) {
				cek = true;
			}
		}
		if (Keyboard.isKeyDown(Keyboard.KEY_F1)) {
		       GL11.glPolygonMode(GL11.GL_FRONT_AND_BACK, GL11.GL_LINE);
		       GL11.glDisable(GL11.GL_TEXTURE_2D);
		}

		if (Keyboard.isKeyDown(Keyboard.KEY_F2)) {
		       GL11.glPolygonMode(GL11.GL_FRONT_AND_BACK, GL11.GL_FILL);
		       GL11.glEnable(GL11.GL_TEXTURE_2D);
		}

	}

	public static void main(String[] args) throws LWJGLException {
		BasicRenderer r = new BasicRenderer();
		r.Start();
	}

}
