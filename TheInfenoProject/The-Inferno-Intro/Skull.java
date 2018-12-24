// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.prop.SkullResource;
// </editor-fold>

class Skull extends Prop {

    /* Construct new Skull */
    public Skull() {
        super(SkullResource.DEFAULT);
    }

    public SJoint getHead() {
        return this.getJoint(SkullResource.HEAD);
    }

    public SJoint getMouth() {
        return this.getJoint(SkullResource.MOUTH);
    }

    public SJoint getLowerLip() {
        return this.getJoint(SkullResource.LOWER_LIP);
    }

    public SJoint getLeftEye() {
        return this.getJoint(SkullResource.LEFT_EYE);
    }

    public SJoint getLeftEyelid() {
        return this.getJoint(SkullResource.LEFT_EYELID);
    }

    public SJoint getRightEye() {
        return this.getJoint(SkullResource.RIGHT_EYE);
    }

    public SJoint getRightEyelid() {
        return this.getJoint(SkullResource.RIGHT_EYELID);
    }
}
