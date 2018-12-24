// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.RockyOutcropResource;
// </editor-fold>

class RockyOutcrop extends Prop {

    /* Construct new RockyOutcrop */
    public RockyOutcrop(RockyOutcropResource resource) {
        super(resource);
    }

    public void setRockyOutcropResource(RockyOutcropResource rockyOutcropResource) {
        this.setJointedModelResource(rockyOutcropResource);
    }
}
