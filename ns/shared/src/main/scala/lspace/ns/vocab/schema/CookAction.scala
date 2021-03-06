package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object CookAction extends OntologyDef(
        iri = "http://schema.org/CookAction",
        iris = Set("http://schema.org/CookAction"),
        label = "CookAction",
        comment = """The act of producing/preparing food.""",
        `@extends` = List(CreateAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreateAction.Properties{
lazy val foodEstablishment = lspace.ns.vocab.schema.foodEstablishment.property
lazy val foodEvent = lspace.ns.vocab.schema.foodEvent.property
lazy val recipe = lspace.ns.vocab.schema.recipe.property
}
override lazy val properties: List[LProperty] = List(foodEstablishment, foodEvent, recipe)
trait Properties extends lspace.ns.vocab.schema.CreateAction.Properties{
lazy val foodEstablishment = lspace.ns.vocab.schema.foodEstablishment.property
lazy val foodEvent = lspace.ns.vocab.schema.foodEvent.property
lazy val recipe = lspace.ns.vocab.schema.recipe.property
}
}