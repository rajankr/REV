package org.swig.Test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ScrollView;
import android.text.method.ScrollingMovementMethod;

public class SwigTest extends Activity
{
    TextView outputText = null;
    ScrollView scroller = null;

   
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        outputText = (TextView)findViewById(R.id.OutputText);
        outputText.setText("Press 'Run' to start...\n");
        outputText.setMovementMethod(new ScrollingMovementMethod());

        scroller = (ScrollView)findViewById(R.id.Scroller);
    }

    public void onRunButtonClick(View view)
    {
      outputText.append("Started...\n");
      nativeCall();
      outputText.append("Finished!\n");
      
      // Ensure scroll to end of text
      scroller.post(new Runnable() {
        public void run() {
          scroller.fullScroll(ScrollView.FOCUS_DOWN);
        }
      });
    }
	
/*public class demo
{
int a,b,c;
}*/
	
public void nativeCall()
{
	
	demo d = new demo();
	
	
	d=Test.getD();
<<<<<<< HEAD
	//d.setA(5);
	//d.setB(6);
	//d.setC(8);
	//Test.setD(d);
	
=======
	d.setA(5);
	d.setB(6);
	d.setC(8);
	Test.setD(d);

>>>>>>> ab6405bcfd5995146715fddace3da78a8d39ca74
	Test.setValue(d);
	


}

 static {
        System.loadLibrary("Test");
    }

/// git 

}
