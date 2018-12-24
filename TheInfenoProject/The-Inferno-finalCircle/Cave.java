// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.CaveResource;
// </editor-fold>

class Cave extends Prop {

    /* Construct new Cave */
    public Cave(CaveResource resource) {
        super(resource);
    }

    public void setCaveResource(CaveResource caveResource) {
        this.setJointedModelResource(caveResource);
    }
}
