import org.scalatest.flatspec.AnyFlatSpec

class ZigZagConversionTest extends AnyFlatSpec {
  "Test" should "Example 1" in {
    assert(ZigZagConversion.convert("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR")
  }
  it should "Example 2" in {
    assert(ZigZagConversion.convert("PAYPALISHIRING", 4) == "PINALSIGYAHRPI")
  }
}
