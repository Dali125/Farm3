const observer = new IntersectionObserver((entries) => {

    entries.forEach((entry) => {
        console.log(entry)
        if (entry.isIntersecting) {
            entry.target.classList.add('show')


        } else {
            entry.target.classList.remove('show')

        }
    })
})
const hiddenElements = document.querySelectorAll('.hidden');
hiddenElements.forEach((el) => observer.observe(el));






query = document.querySelector(".ex");
query.onclick = function() {

    subnav = document.querySelector(".sub-nav");

    subnav.classList.toggle("active");
}