package com.example.abs;
interface Button{
	void onClick();
}

interface ComboBox{
	void checkChanged();
}
class Application{
    Button button;
    ComboBox comboBox;
    
    public Application(Button button , ComboBox comboBox) {
		this.button=button;
		this.comboBox=comboBox;
	}
    
    void operateOnApp() {
    	button.onClick();
    	comboBox.checkChanged();
    }
}

public class MyGraphicalInterface {
   public static void main(String[] args) {
	   
	   Application app1 = new Application(new Button() {
		
		@Override
		public void onClick() {
			System.out.println("the button has been clicked");
		}
	}, new ComboBox() {
		
		@Override
		public void checkChanged() {
			System.out.println("the check has been changed");
		}
	});
	   
	   app1.operateOnApp();
	
}
}
