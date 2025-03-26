// Create interface EventListener with performEvent() method. Create MouseListener 
// interface which inherits EventListener along with mouseClicked(), mousePressed(), 
// mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener 
// interface which inherits EventListener along with keyPressed(), keyReleased() methods. 
// WAP to create EventDemo class which implements MouseListener and KeyListener and 
// demonstrate all the methods of the interfaces. 


interface EventListener{
    void performEvent();
}
interface MouseListener extends EventListener{
    void mouseClicked();
    void  mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener{
    void keyPressed();
    void keyReleased();
}
class EventDemo implements MouseListener , KeyListener{
    public void performEvent(){}
    public void mouseClicked(){}
    public void  mousePressed(){}
    public void mouseReleased(){}
    public void mouseMoved(){}
    public void mouseDragged(){}
    public void keyPressed(){}
    public void keyReleased(){}
}

public class Lab9A4 {
    public static void main(String[] args) {
        EventDemo obj1 = new EventDemo();
    }
}
