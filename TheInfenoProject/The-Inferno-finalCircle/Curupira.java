// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.biped.CurupiraResource;
// </editor-fold>

class Curupira extends Biped {

    /* Construct new Curupira */
    public Curupira() {
        super(CurupiraResource.DEFAULT);
    }

    public SJoint getLeftEar() {
        return this.getJoint(CurupiraResource.LEFT_EAR);
    }

    public SJoint getRightEar() {
        return this.getJoint(CurupiraResource.RIGHT_EAR);
    }
}
