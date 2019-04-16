package oopHomework;

public class CellPhone extends LandPhone implements TeleComunication  {


    @Override
    public void MakeCall() {
        System.out.println("cell phone makecall");

    }

    @Override
    public void Text() {
        System.out.println("cell phone send text");


    }

    @Override
    public void ReceiveCall() {
        System.out.println("cell phone receive call");

    }

    @Override
    public void mess() {
        System.out.println("cell phone sent mess");



    }
}
