package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object geoEquals extends PropertyDef(
        iri = "http://schema.org/geoEquals",
        iris = Set("http://schema.org/geoEquals"),
        label = "geoEquals",
        comment = """Represents spatial relations in which two geometries (or the places they represent) are topologically equal, as defined in <a href="https://en.wikipedia.org/wiki/DE-9IM">DE-9IM</a>. "Two geometries are topologically equal if their interiors intersect and no part of the interior or boundary of one geometry intersects the exterior of the other" (a symmetric relationship)""",
        `@extends` = List(),
        `@range` = List(GeospatialGeometry.ontology, Place.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}