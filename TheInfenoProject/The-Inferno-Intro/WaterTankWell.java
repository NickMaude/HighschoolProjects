// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.WaterTankWellResource;
// </editor-fold>

class WaterTankWell extends Prop {

    /* Construct new WaterTankWell */
    public WaterTankWell(WaterTankWellResource resource) {
        super(resource);
    }

    public void setWaterTankWellResource(WaterTankWellResource waterTankWellResource) {
        this.setJointedModelResource(waterTankWellResource);
    }
}
