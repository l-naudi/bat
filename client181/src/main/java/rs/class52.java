package main.java.rs;

import java.awt.*;
import java.awt.image.*;
import java.util.Hashtable;

public final class class52 extends class322 {

    Image field440;
    Component field439;

    class52(int i_1, int i_2, Component component_3) {
        super.field3877 = i_1;
        super.field3878 = i_2;
        super.field3876 = new int[i_2 * i_1 + 1];
        DataBufferInt databufferint_4 = new DataBufferInt(super.field3876, super.field3876.length);
        DirectColorModel directcolormodel_5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster writableraster_6 = Raster.createWritableRaster(directcolormodel_5.createCompatibleSampleModel(super.field3877, super.field3878), databufferint_4, null);
        this.field440 = new BufferedImage(directcolormodel_5, writableraster_6, false, new Hashtable());
        this.method856(component_3, (byte) 0);
        this.method6078((byte) 106);
    }

    final void method860(Graphics graphics_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        try {
            Shape shape_7 = graphics_1.getClip();
            graphics_1.clipRect(i_2, i_3, i_4, i_5);
            graphics_1.drawImage(this.field440, 0, 0, this.field439);
            graphics_1.setClip(shape_7);
        } catch (Exception exception_8) {
            this.field439.repaint();
        }

    }

    final void method867(Graphics graphics_1, int i_2, int i_3, int i_4) {
        try {
            graphics_1.drawImage(this.field440, i_2, i_3, this.field439);
        } catch (Exception exception_6) {
            this.field439.repaint();
        }

    }

    final void method856(Component component_1, byte b_2) {
        this.field439 = component_1;
    }

    public final void vmethod6077(int i_1, int i_2, int i_3) {
        this.method867(this.field439.getGraphics(), i_1, i_2, 689962734);
    }

    public final void vmethod6075(int i_1, int i_2, int i_3, int i_4, int i_5) {
        this.method860(this.field439.getGraphics(), i_1, i_2, i_3, i_4, -143326584);
    }

}
