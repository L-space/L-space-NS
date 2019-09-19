package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CampingPitch extends OntologyDef(
        iri = "http://schema.org/CampingPitch",
        iris = Set("http://schema.org/CampingPitch"),
        label = "CampingPitch",
        comment = """A camping pitch is an individual place for overnight stay in the outdoors, typically being part of a larger camping site.
<br /><br />
See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>.""",
        `@extends` = () => List(Accommodation.ontology)
       ){
}