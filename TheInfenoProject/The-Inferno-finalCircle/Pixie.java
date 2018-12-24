// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.biped.PixieResource;
// </editor-fold>

class Pixie extends Biped {

    /* Construct new Pixie */
    public Pixie(PixieResource resource) {
        super(resource);
    }

    public SJoint getRightBottomWing() {
        return this.getJoint(PixieResource.RIGHT_BOTTOM_WING);
    }

    public SJoint getLeftBottomWing() {
        return this.getJoint(PixieResource.LEFT_BOTTOM_WING);
    }

    public SJoint getRightTopWing() {
        return this.getJoint(PixieResource.RIGHT_TOP_WING);
    }

    public SJoint getLeftTopWing() {
        return this.getJoint(PixieResource.LEFT_TOP_WING);
    }

    public void setPixieResource(PixieResource pixieResource) {
        this.setJointedModelResource(pixieResource);
    }
}
