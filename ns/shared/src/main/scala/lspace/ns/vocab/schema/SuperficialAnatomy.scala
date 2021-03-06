package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object SuperficialAnatomy extends OntologyDef(
        iri = "http://schema.org/SuperficialAnatomy",
        iris = Set("http://schema.org/SuperficialAnatomy"),
        label = "SuperficialAnatomy",
        comment = """Anatomical features that can be observed by sight (without dissection), including the form and proportions of the human body as well as surface landmarks that correspond to deeper subcutaneous structures. Superficial anatomy plays an important role in sports medicine, phlebotomy, and other medical specialties as underlying anatomical structures can be identified through surface palpation. For example, during back surgery, superficial anatomy can be used to palpate and count vertebrae to find the site of incision. Or in phlebotomy, superficial anatomy can be used to locate an underlying vein; for example, the median cubital vein can be located by palpating the borders of the cubital fossa (such as the epicondyles of the humerus) and then looking for the superficial signs of the vein, such as size, prominence, ability to refill after depression, and feel of surrounding tissue support. As another example, in a subluxation (dislocation) of the glenohumeral joint, the bony structure becomes pronounced with the deltoid muscle failing to cover the glenohumeral joint allowing the edges of the scapula to be superficially visible. Here, the superficial anatomy is the visible edges of the scapula, implying the underlying dislocation of the joint (the related anatomical structure).""",
        `@extends` = List(MedicalEntity.ontology)
       ){
object keys extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val associatedPathophysiology = lspace.ns.vocab.schema.associatedPathophysiology.property
lazy val relatedAnatomy = lspace.ns.vocab.schema.relatedAnatomy.property
lazy val relatedCondition = lspace.ns.vocab.schema.relatedCondition.property
lazy val relatedTherapy = lspace.ns.vocab.schema.relatedTherapy.property
lazy val significance = lspace.ns.vocab.schema.significance.property
}
override lazy val properties: List[LProperty] = List(associatedPathophysiology, relatedAnatomy, relatedCondition, relatedTherapy, significance)
trait Properties extends lspace.ns.vocab.schema.MedicalEntity.Properties{
lazy val associatedPathophysiology = lspace.ns.vocab.schema.associatedPathophysiology.property
lazy val relatedAnatomy = lspace.ns.vocab.schema.relatedAnatomy.property
lazy val relatedCondition = lspace.ns.vocab.schema.relatedCondition.property
lazy val relatedTherapy = lspace.ns.vocab.schema.relatedTherapy.property
lazy val significance = lspace.ns.vocab.schema.significance.property
}
}