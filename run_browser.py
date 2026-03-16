"""Lanceur mode navigateur — pas d'overlay pywebview."""
import main as m
m.OVERLAY_MODE = False
m.PARSE_EXISTING_LOG = True
m.main()
