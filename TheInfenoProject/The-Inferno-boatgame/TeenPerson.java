// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.sims2.TeenPersonResource;
// </editor-fold>

class TeenPerson extends Person {

    /* Construct new TeenPerson */
    public TeenPerson(TeenPersonResource resource) {
        super(resource);
    }

    public void setTeenPersonResource(TeenPersonResource teenPersonResource) {
        this.setJointedModelResource(teenPersonResource);
    }
}
