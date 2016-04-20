package com.scalacraft.professionalscala.chapter8

/**
  * Nesting of inline styles.
  *
  * All inline styles: '''bold''', ''italic'', `monospace`, __underline__, ^superscript^, ,,subscript,,.
  *
  * Bold, Italic: '''bold and ''italic'', end'''
  *
  * Italic, Bold: ''italic and '''bold''', end''
  *
  * Bold, Monospace: '''bold and `monospace`, end'''
  *
  * Monospace, Bold: `monospace and '''bold''', end`
  *
  * Bold, Underline: '''bold and __underline__, end'''
  *
  * Underline, Bold: __underline and '''bold''', end__
  *
  * Italic, Monospace: ''italic and `monospace`, end''
  *
  * Monospace, Italic: `monospace and ''italic'', end`
  *
  * Italic, Underline: ''italic and __underline__, end''
  *
  * Underline, Italic: __underline and ''italic'', end__
  *
  * Monospace, Underline: `monospace and __underline__, end`
  *
  * Underline, Monospace, : __underline and `monospace`, end__
  *
  * Superscript, Underline: ^superscript, __underline__^
  *
  * Underline, Superscript: __underline and ^superscript^, end__
  **/
class InlineNesting
