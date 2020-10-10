int rectX = 0;
int rectSize = 500;
int circleX = rectSize/2;
int circleSize = 200;
int color = 200;
int color2 = 50;

void setup() {
	size(500, 500);
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)
  circleX = circleX + 1;
  background(255);
  stroke(0);
  fill(color,0,0);
  rect(rectX,rectX,rectSize,rectSize);
  fill(color2,0,0)
  ellipse(circleX,circleX,circleSize,circleSize);
  


  

}
