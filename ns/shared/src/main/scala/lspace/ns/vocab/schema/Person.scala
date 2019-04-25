package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Person
    extends OntologyDef(
      iri = "http://schema.org/Person",
      iris = Set("http://schema.org/Person"),
      label = "Person",
      comment = """A person (alive, dead, undead, or fictional).""",
      `@extends` = () => List(Thing.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val children             = lspace.ns.vocab.schema.children.property
    lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples.property
    lazy val hasOccupation        = lspace.ns.vocab.schema.hasOccupation.property
    lazy val email                = lspace.ns.vocab.schema.email.property
    lazy val faxNumber            = lspace.ns.vocab.schema.faxNumber.property
    lazy val naics                = lspace.ns.vocab.schema.naics.property
    lazy val knowsLanguage        = lspace.ns.vocab.schema.knowsLanguage.property
    lazy val nationality          = lspace.ns.vocab.schema.nationality.property
    lazy val makesOffer           = lspace.ns.vocab.schema.makesOffer.property
    lazy val performerIn          = lspace.ns.vocab.schema.performerIn.property
    lazy val netWorth             = lspace.ns.vocab.schema.netWorth.property
    lazy val workLocation         = lspace.ns.vocab.schema.workLocation.property
    lazy val honorificPrefix      = lspace.ns.vocab.schema.honorificPrefix.property
    lazy val alumniOf             = lspace.ns.vocab.schema.alumniOf.property
    lazy val deathDate            = lspace.ns.vocab.schema.deathDate.property
    lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
    lazy val honorificSuffix      = lspace.ns.vocab.schema.honorificSuffix.property
    lazy val colleague            = lspace.ns.vocab.schema.colleague.property
    lazy val birthPlace           = lspace.ns.vocab.schema.birthPlace.property
    lazy val duns                 = lspace.ns.vocab.schema.duns.property
    lazy val gender               = lspace.ns.vocab.schema.gender.property
    lazy val awards               = lspace.ns.vocab.schema.awards.property
    lazy val taxID                = lspace.ns.vocab.schema.taxID.property
    lazy val award                = lspace.ns.vocab.schema.award.property
    lazy val knowsAbout           = lspace.ns.vocab.schema.knowsAbout.property
    lazy val homeLocation         = lspace.ns.vocab.schema.homeLocation.property
    lazy val height               = lspace.ns.vocab.schema.height.property
    lazy val relatedTo            = lspace.ns.vocab.schema.relatedTo.property
    lazy val memberOf             = lspace.ns.vocab.schema.memberOf.property
    lazy val parent               = lspace.ns.vocab.schema.parent.property
    lazy val contactPoints        = lspace.ns.vocab.schema.contactPoints.property
    lazy val additionalName       = lspace.ns.vocab.schema.additionalName.property
    lazy val knows                = lspace.ns.vocab.schema.knows.property
    lazy val affiliation          = lspace.ns.vocab.schema.affiliation.property
    lazy val givenName            = lspace.ns.vocab.schema.givenName.property
    lazy val familyName           = lspace.ns.vocab.schema.familyName.property
    lazy val telephone            = lspace.ns.vocab.schema.telephone.property
    lazy val isicV4               = lspace.ns.vocab.schema.isicV4.property
    lazy val brand                = lspace.ns.vocab.schema.brand.property
    lazy val vatID                = lspace.ns.vocab.schema.vatID.property
    lazy val contactPoint         = lspace.ns.vocab.schema.contactPoint.property
    lazy val parents              = lspace.ns.vocab.schema.parents.property
    lazy val siblings             = lspace.ns.vocab.schema.siblings.property
    lazy val weight               = lspace.ns.vocab.schema.weight.property
    lazy val hasOfferCatalog      = lspace.ns.vocab.schema.hasOfferCatalog.property
    lazy val owns                 = lspace.ns.vocab.schema.owns.property
    lazy val worksFor             = lspace.ns.vocab.schema.worksFor.property
    lazy val jobTitle             = lspace.ns.vocab.schema.jobTitle.property
    lazy val hasPOS               = lspace.ns.vocab.schema.hasPOS.property
    lazy val seeks                = lspace.ns.vocab.schema.seeks.property
    lazy val birthDate            = lspace.ns.vocab.schema.birthDate.property
    lazy val deathPlace           = lspace.ns.vocab.schema.deathPlace.property
    lazy val follows              = lspace.ns.vocab.schema.follows.property
    lazy val sibling              = lspace.ns.vocab.schema.sibling.property
  }
  override lazy val properties: List[LProperty] = List(
    children,
    publishingPrinciples,
    hasOccupation,
    email,
    faxNumber,
    naics,
    knowsLanguage,
    nationality,
    makesOffer,
    performerIn,
    netWorth,
    workLocation,
    honorificPrefix,
    alumniOf,
    deathDate,
    globalLocationNumber,
    honorificSuffix,
    colleague,
    birthPlace,
    duns,
    gender,
    awards,
    taxID,
    award,
    knowsAbout,
    homeLocation,
    height,
    relatedTo,
    memberOf,
    parent,
    contactPoints,
    additionalName,
    knows,
    affiliation,
    givenName,
    familyName,
    telephone,
    isicV4,
    brand,
    vatID,
    contactPoint,
    parents,
    siblings,
    weight,
    hasOfferCatalog,
    owns,
    worksFor,
    jobTitle,
    hasPOS,
    seeks,
    birthDate,
    deathPlace,
    follows,
    sibling
  )
  trait Properties extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val children             = lspace.ns.vocab.schema.children.property
    lazy val publishingPrinciples = lspace.ns.vocab.schema.publishingPrinciples.property
    lazy val hasOccupation        = lspace.ns.vocab.schema.hasOccupation.property
    lazy val email                = lspace.ns.vocab.schema.email.property
    lazy val faxNumber            = lspace.ns.vocab.schema.faxNumber.property
    lazy val naics                = lspace.ns.vocab.schema.naics.property
    lazy val knowsLanguage        = lspace.ns.vocab.schema.knowsLanguage.property
    lazy val nationality          = lspace.ns.vocab.schema.nationality.property
    lazy val makesOffer           = lspace.ns.vocab.schema.makesOffer.property
    lazy val performerIn          = lspace.ns.vocab.schema.performerIn.property
    lazy val netWorth             = lspace.ns.vocab.schema.netWorth.property
    lazy val workLocation         = lspace.ns.vocab.schema.workLocation.property
    lazy val honorificPrefix      = lspace.ns.vocab.schema.honorificPrefix.property
    lazy val alumniOf             = lspace.ns.vocab.schema.alumniOf.property
    lazy val deathDate            = lspace.ns.vocab.schema.deathDate.property
    lazy val globalLocationNumber = lspace.ns.vocab.schema.globalLocationNumber.property
    lazy val honorificSuffix      = lspace.ns.vocab.schema.honorificSuffix.property
    lazy val colleague            = lspace.ns.vocab.schema.colleague.property
    lazy val birthPlace           = lspace.ns.vocab.schema.birthPlace.property
    lazy val duns                 = lspace.ns.vocab.schema.duns.property
    lazy val gender               = lspace.ns.vocab.schema.gender.property
    lazy val awards               = lspace.ns.vocab.schema.awards.property
    lazy val taxID                = lspace.ns.vocab.schema.taxID.property
    lazy val award                = lspace.ns.vocab.schema.award.property
    lazy val knowsAbout           = lspace.ns.vocab.schema.knowsAbout.property
    lazy val homeLocation         = lspace.ns.vocab.schema.homeLocation.property
    lazy val height               = lspace.ns.vocab.schema.height.property
    lazy val relatedTo            = lspace.ns.vocab.schema.relatedTo.property
    lazy val memberOf             = lspace.ns.vocab.schema.memberOf.property
    lazy val parent               = lspace.ns.vocab.schema.parent.property
    lazy val contactPoints        = lspace.ns.vocab.schema.contactPoints.property
    lazy val additionalName       = lspace.ns.vocab.schema.additionalName.property
    lazy val knows                = lspace.ns.vocab.schema.knows.property
    lazy val affiliation          = lspace.ns.vocab.schema.affiliation.property
    lazy val givenName            = lspace.ns.vocab.schema.givenName.property
    lazy val familyName           = lspace.ns.vocab.schema.familyName.property
    lazy val telephone            = lspace.ns.vocab.schema.telephone.property
    lazy val isicV4               = lspace.ns.vocab.schema.isicV4.property
    lazy val brand                = lspace.ns.vocab.schema.brand.property
    lazy val vatID                = lspace.ns.vocab.schema.vatID.property
    lazy val contactPoint         = lspace.ns.vocab.schema.contactPoint.property
    lazy val parents              = lspace.ns.vocab.schema.parents.property
    lazy val siblings             = lspace.ns.vocab.schema.siblings.property
    lazy val weight               = lspace.ns.vocab.schema.weight.property
    lazy val hasOfferCatalog      = lspace.ns.vocab.schema.hasOfferCatalog.property
    lazy val owns                 = lspace.ns.vocab.schema.owns.property
    lazy val worksFor             = lspace.ns.vocab.schema.worksFor.property
    lazy val jobTitle             = lspace.ns.vocab.schema.jobTitle.property
    lazy val hasPOS               = lspace.ns.vocab.schema.hasPOS.property
    lazy val seeks                = lspace.ns.vocab.schema.seeks.property
    lazy val birthDate            = lspace.ns.vocab.schema.birthDate.property
    lazy val deathPlace           = lspace.ns.vocab.schema.deathPlace.property
    lazy val follows              = lspace.ns.vocab.schema.follows.property
    lazy val sibling              = lspace.ns.vocab.schema.sibling.property
  }
}
