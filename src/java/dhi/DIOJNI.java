/**
 * @project dhi
 * @author samuelproulx
 * @date 2021-10-11
 */
package java.dhi;

public class DIOJNI extends JNIWrapper {
    public static native int initializeDIOPort(int halPortHandle, boolean input);

    public static native boolean checkDIOChannel(int channel);

    public static native void freeDIOPort(int dioPortHandle);

    public static native void setDIOSimDevice(int handle, int device);

    public static native void setDIO(int dioPortHandle, boolean value);

    public static native void setDIODirection(int dioPortHandle, boolean input);

    public static native boolean getDIO(int dioPortHandle);

    public static native boolean getDIODirection(int dioPortHandle);

    public static native void pulse(int dioPortHandle, double pulseLength);

    public static native boolean isPulsing(int dioPortHandle);

    public static native boolean isAnyPulsing();

    public static native short getLoopTiming();

    public static native int allocateDigitalPWM();

    public static native void freeDigitalPWM(int pwmGenerator);

    public static native void setDigitalPWMRate(double rate);

    public static native void setDigitalPWMDutyCycle(int pwmGenerator, double dutyCycle);

    public static native void setDigitalPWMOutputChannel(int pwmGenerator, int channel);
}
