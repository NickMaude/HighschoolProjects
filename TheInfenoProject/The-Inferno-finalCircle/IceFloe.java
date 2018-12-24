// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.IceFloeResource;
// </editor-fold>

class IceFloe extends Prop {

    /* Construct new IceFloe */
    public IceFloe(IceFloeResource resource) {
        super(resource);
    }

    public void setIceFloeResource(IceFloeResource iceFloeResource) {
        this.setJointedModelResource(iceFloeResource);
    }
}
