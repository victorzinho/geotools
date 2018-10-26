/**
 *
 * $Id$
 */
package net.opengis.ows10.validation;

import net.opengis.ows10.MetadataType;
import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.opengis.ows10.DomainType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DomainTypeValidator {
  boolean validate();

  boolean validateValue(EList<String> value);

  boolean validateValue(String value);
  boolean validateMetadata(EList value);
  boolean validateName(EList<String> value);

  boolean validateName(String value);
}