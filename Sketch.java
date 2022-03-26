import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// determining size
    size(600, 600);
  }

  // set background colour
  public void setup() {
    background(255);
  }

  public void draw() {
	  
    stroke(0);

    // q1
    // two for loops, one draws verticle lines, other draws horizontal lines every 30 units or 1/20 of the height
    for (int intLineX = height / 20; intLineX <= height / 2; intLineX += height / 20) {
      line(intLineX, 0, intLineX, height / 2);
    }
    for (int intLineY = width / 20; intLineY <= width / 2; intLineY += width / 20) {
      line(width * 0, intLineY, width/2, intLineY);
    }

    // q2 
    // nested for loops to draw 5 rows of circles 
    fill(255, 0, 0);

    for (int intCircleY = height / 20; intCircleY <= height / 2; intCircleY += height / 10) {
      for (int intCircleX = width / 2 + width / 20; intCircleX <= width; intCircleX += width / 10) {
        ellipse(intCircleX, intCircleY, width / 20, height / 20);
      }
    }

    // q3
    // for loop repeating every unit, gradually increasing the rgb colour every iteration to create a gradient effect
    for (int i = 0; i <= width / 2; i++) {
      int intrgb = i - 45;
      stroke(intrgb, intrgb, intrgb);
      line(i, height / 2 + 1, i, height);     
    }

    // q4
    // for loop to draw flower petals, iterating through each 45 degrees
    for (int intAngle = 0; intAngle <= 360; intAngle += 45) {
      stroke(0);
      fill(255, 215, 0);

      pushMatrix();
      translate(width * 3 / 4, height * 3 / 4);
      rotate(radians(intAngle));
      ellipse(0, 0, width / 25, height / 3);
      popMatrix();
    }
    
    // draw middle petal of the flower
    noStroke();
    fill(38, 108, 45);
    ellipse(width * 3 / 4, height * 3 / 4, height / 12 + height / 120, height / 12 + height / 120);


  }
}