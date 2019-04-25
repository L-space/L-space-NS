package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object FundingAgency
    extends OntologyDef(
      iri = "http://schema.org/FundingAgency",
      iris = Set("http://schema.org/FundingAgency"),
      label = "FundingAgency",
      comment =
        """A FundingAgency is an organization that implements one or more <a class="localLink" href="http://schema.org/FundingScheme">FundingScheme</a>s and manages
    the granting process (via <a class="localLink" href="http://schema.org/Grant">Grant</a>s, typically <a class="localLink" href="http://schema.org/MonetaryGrant">MonetaryGrant</a>s).
    A funding agency is not always required for grant funding, e.g. philanthropic giving, corporate sponsorship etc.<br/><br/>

<pre><code>Examples of funding agencies include ERC, REA, NIH, Bill and Melinda Gates Foundation...
</code></pre>
""",
      `@extends` = () => List(Project.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Project.Properties {}
  override lazy val properties: List[LProperty] = List()
  trait Properties extends lspace.ns.vocab.schema.Project.Properties {}
}
