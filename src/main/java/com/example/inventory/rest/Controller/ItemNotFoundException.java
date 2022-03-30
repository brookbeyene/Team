package com.example.inventory.rest.Controller;

public class ItemNotFoundException extends RuntimeException {
    ItemNotFoundException() {super("Could not find item in repository");}
}
