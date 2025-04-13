// Smooth Scroll for anchor links
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener('click', function (e) {
        e.preventDefault();

        document.querySelector(this.getAttribute('href')).scrollIntoView({
            behavior: 'smooth'
        });
    });
});

// Navbar Sticky Effect
window.onscroll = function() {stickyNavbar()};

var navbar = document.querySelector("header");
var sticky = navbar.offsetTop;

function stickyNavbar() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
  } else {
    navbar.classList.remove("sticky");
  }
}

// Hover Effect for CTA buttons
const ctaButtons = document.querySelectorAll('.cta-btn');
ctaButtons.forEach(button => {
    button.addEventListener('mouseover', () => {
        button.style.backgroundColor = "#e67e22";
    });
    button.addEventListener('mouseout', () => {
        button.style.backgroundColor = "#FF9900";
    });
});
