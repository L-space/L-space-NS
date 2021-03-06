package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Claim extends OntologyDef(
        iri = "http://schema.org/Claim",
        iris = Set("http://schema.org/Claim"),
        label = "Claim",
        comment = """A <a class="localLink" href="http://schema.org/Claim">Claim</a> in Schema.org represents a specific, factually-oriented claim that could be the <a class="localLink" href="http://schema.org/itemReviewed">itemReviewed</a> in a <a class="localLink" href="http://schema.org/ClaimReview">ClaimReview</a>. The content of a claim can be summarized with the <a class="localLink" href="http://schema.org/text">text</a> property. Variations on well known claims can have their common identity indicated via <a class="localLink" href="http://schema.org/sameAs">sameAs</a> links, and summarized with a <a class="localLink" href="http://schema.org/name">name</a>. Ideally, a <a class="localLink" href="http://schema.org/Claim">Claim</a> description includes enough contextual information to minimize the risk of ambiguity or inclarity. In practice, many claims are better understood in the context in which they appear or the interpretations provided by claim reviews.<br/><br/>

Beyond <a class="localLink" href="http://schema.org/ClaimReview">ClaimReview</a>, the Claim type can be associated with related creative works - for example a <a class="localLink" href="http://schema.org/ScholaryArticle">ScholaryArticle</a> or <a class="localLink" href="http://schema.org/Question">Question</a> might be <a class="localLink" href="http://schema.org/about">about</a> some <a class="localLink" href="http://schema.org/Claim">Claim</a>.<br/><br/>

At this time, Schema.org does not define any types of relationship between claims. This is a natural area for future exploration.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val appearance = lspace.ns.vocab.schema.appearance.property
lazy val firstAppearance = lspace.ns.vocab.schema.firstAppearance.property
}
override lazy val properties: List[LProperty] = List(appearance, firstAppearance)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val appearance = lspace.ns.vocab.schema.appearance.property
lazy val firstAppearance = lspace.ns.vocab.schema.firstAppearance.property
}
}